package com.bilicraft.bilicraftdanmaku.protocol.client;

import com.bilicraft.bilicraftdanmaku.protocol.CommonDanmakuType;
import com.bilicraft.bilicraftdanmaku.protocol.Packet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Builder
@Data
public class ClientDanmakuPacket extends Packet {
    private CommonDanmakuType type;
    private boolean showName;
    private UUID sender;
    private String senderDisplayName;
    private String jsonText;
}
