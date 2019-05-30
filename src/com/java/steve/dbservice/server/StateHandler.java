package com.java.steve.dbservice.server;

import com.java.steve.dbservice.DBApplication;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class StateHandler extends BaseHandler {

    @Override
    public void handle(HttpExchange request) throws IOException {
        super.handle(request);
        String state = DBApplication.INSTANCE.getStateName();
        request.sendResponseHeaders(200, state.length());
        request.getResponseHeaders().put("Content-Type", Arrays.asList(new String[]{"application/xml"}));
        OutputStream os = request.getResponseBody();
        os.write(state.getBytes());
        os.close();
    }

}
