<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!--
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
-->
<style type="text/css">
    input#chat {
        width: 410px
    }

    #console-container {
        width: 400px;
    }

    #console {
        border: 1px solid #CCCCCC;
        border-right-color: #999999;
        border-bottom-color: #999999;
        height: 170px;
        overflow-y: scroll;
        padding: 5px;
        width: 100%;
    }

    #console p {
        padding: 0;
        margin: 0;
    }
</style>
<script type="application/javascript">
    "use strict";

    var Chat = {};

    Chat.socket = null;

    Chat.connect = (function(host) {
        if ('WebSocket' in window) {
            Chat.socket = new WebSocket(host);
        } else if ('MozWebSocket' in window) {
            Chat.socket = new MozWebSocket(host);
        } else {
            Console.log('Error: 您的浏览器不支持在线聊天.');
            return;
        }

        Chat.socket.onopen = function () {
            Console.log('消息：聊天室已经建立');
            document.getElementById('chat').onkeydown = function(event) {
                if (event.keyCode == 13) {
                    Chat.sendMessage();
                }
            };
        };

        Chat.socket.onclose = function () {
            document.getElementById('chat').onkeydown = null;
            Console.log('消息: 连接中断.');
        };

        Chat.socket.onmessage = function (message) {
            Console.log(message.data);
        };
    });

    Chat.initialize = function() {
    	
    	var WEB_APP="${pageContext.request.contextPath}";
    	
        if (window.location.protocol == 'http:') {
            Chat.connect('ws://' + window.location.host + WEB_APP+'/websocket/chat');
        } else {
            Chat.connect('wss://' + window.location.host + WEB_APP+'/websocket/chat');
        }
    };

    Chat.sendMessage = (function() {
        var message = document.getElementById('chat').value;
        if (message != '') {
            Chat.socket.send(message);
            document.getElementById('chat').value = '';
        }
    });

    var Console = {};

    Console.log = (function(message) {
        var console = document.getElementById('console');
        var p = document.createElement('p');
        p.style.wordWrap = 'break-word';
        p.innerHTML = message;
        console.appendChild(p);
        while (console.childNodes.length > 25) {
            console.removeChild(console.firstChild);
        }
        console.scrollTop = console.scrollHeight;
    });

    Chat.initialize();


    document.addEventListener("DOMContentLoaded", function() {
        // Remove elements with "noscript" class - <noscript> is not allowed in XHTML
        var noscripts = document.getElementsByClassName("noscript");
        for (var i = 0; i < noscripts.length; i++) {
            noscripts[i].parentNode.removeChild(noscripts[i]);
        }
    }, false);
</script>
<section id="portfolio">
	<div class="container">
<div class="noscript"><h2 style="color: #ff0000">看起来您的浏览器并不支持此在线聊天系统</h2>/h2></div>

<div>
    <p>
        <input type="text" class="form-control" placeholder="type and press enter to chat" id="chat"></textarea>
    </p>
    <div id="console-container col-sm-12" class="row" >
		<div id="console" class="col-sm-12 portfolio-item" style="height: 500px;">
		</div>
	</div>
</div>
</div>
</section>