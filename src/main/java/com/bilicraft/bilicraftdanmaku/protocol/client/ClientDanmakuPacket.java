package com.bilicraft.bilicraftdanmaku.protocol.client;

import com.bilicraft.bilicraftdanmaku.protocol.CommonDanmakuType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Builder
@Data
public class ClientDanmakuPacket {
    private CommonDanmakuType type;
    private boolean showName;
    private UUID sender;
    private String senderDisplayName;
    private String jsonText;
}
