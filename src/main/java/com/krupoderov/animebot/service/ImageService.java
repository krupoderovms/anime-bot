package com.krupoderov.animebot.service;

import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;

import java.io.IOException;

public interface ImageService {
    public SendPhoto getPhoto(long chatId,
                              String category,
                              String firstButtonName,
                              String secondButtonName,
                              String firstCallbackData,
                              String secondCallbackData) throws IOException;

    public SendPhoto getPhoto(long chatId,
                              String category,
                              String firstButtonName,
                              String secondButtonName,
                              String thirdButtonName,
                              String firstCallbackData,
                              String secondCallbackData,
                              String thirdButtonCallbackData) throws IOException;
}
