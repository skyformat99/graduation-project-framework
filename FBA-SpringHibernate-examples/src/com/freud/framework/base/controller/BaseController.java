package com.freud.framework.base.controller;

import java.text.MessageFormat;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.freud.framework.exception.ServiceRuntimeException;

public abstract class BaseController {

	/**
	 * The LOGGER.
	 */
	private static final Logger LOGGER = Logger.getLogger(BaseController.class);

	/**
	 * The jsp file [error.jsp].
	 */
	private static final String JSP_FILE_ERROR = "error";

	/**
	 * The Error Key : exception.
	 */
	private static final String ERROR_KEY_EXCEPTION = "exception";
	/**
	 * The Error Key : message.
	 */
	private static final String ERROR_KEY_MESSAGE = "message";

	/**
	 * The Error Description String : ERROR_STRING_ERROR_OCCURED.
	 */
	private static final String ERROR_STRING_ERROR_OCCURED = "Exception occured : {0}";

	@ExceptionHandler(Exception.class)
	protected ModelAndView exception(Exception e) {

		LOGGER.error(MessageFormat.format(ERROR_STRING_ERROR_OCCURED,
				e.getMessage()));

		e.printStackTrace();

		return packageExceptionModelAndView(JSP_FILE_ERROR, e, e.getMessage());
	}

	@ExceptionHandler(ServiceRuntimeException.class)
	protected ModelAndView serviceRuntimeException(ServiceRuntimeException e) {

		LOGGER.error(MessageFormat.format(ERROR_STRING_ERROR_OCCURED,
				e.getMessage()));

		e.printStackTrace();

		return packageExceptionModelAndView(JSP_FILE_ERROR, e, e.getMessage());
	}

	private ModelAndView packageExceptionModelAndView(String view,
			Exception exception, Object errorMessage) {

		ModelAndView mav = new ModelAndView(view);

		mav.addObject(ERROR_KEY_EXCEPTION, exception);
		mav.addObject(ERROR_KEY_MESSAGE, errorMessage);

		return mav;
	}

}
