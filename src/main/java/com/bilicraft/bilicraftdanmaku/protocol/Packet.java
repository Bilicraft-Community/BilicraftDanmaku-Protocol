package com.bilicraft.bilicraftdanmaku.protocol;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

public abstract class Packet {
    private final static Gson gson = new Gson();
    public String serialize(){
        return gson.toJson(this);
    }
    public byte[] serializeBytes(){
        return gson.toJson(this).getBytes(StandardCharsets.UTF_8);
    }
    public static <T> T deserialize(String json,Type typeOfT){
        return gson.fromJson(json,typeOfT);
    }
    public static <T> T deserialize(byte[] bytes,Type typeOfT){
        return gson.fromJson(new String(bytes,StandardCharsets.UTF_8),typeOfT);
    }
}
