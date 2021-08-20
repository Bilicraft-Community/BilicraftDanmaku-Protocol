package com.bilicraft.bilicraftdanmaku.protocol.server;

import com.bilicraft.bilicraftdanmaku.protocol.CommonDanmakuType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class ServerDanmakuPacket {
    private CommonDanmakuType type;
    private long lifespan;
    private String jsonText;
}
