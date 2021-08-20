package com.bilicraft.bilicraftdanmaku.protocol.server;

import com.bilicraft.bilicraftdanmaku.protocol.CommonDanmakuType;
import com.bilicraft.bilicraftdanmaku.protocol.Packet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Builder
@Data
public class ServerDanmakuPacket extends Packet {
    private CommonDanmakuType type;
    private long lifespan;
    private String jsonText;
}
