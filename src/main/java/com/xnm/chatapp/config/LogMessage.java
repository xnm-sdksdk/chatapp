package com.xnm.chatapp.config;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
public class LogMessage {
    private static final Logger logger = LoggerFactory.getLogger(LogMessage.class);

    public static <T> void logMessage(T message) {
        logger.info("New Message: {}" , message);
    }
}
