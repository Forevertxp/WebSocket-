package com.olstudent.handler;

import io.netty.channel.ChannelHandler;

/**
 * handler.
 *
 * @author txp.
 */
public class Handler {
    private String name;
    private ChannelHandler handler;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChannelHandler getHandler() {
        return handler;
    }

    public void setHandler(ChannelHandler handler) {
        this.handler = handler;
    }
}
