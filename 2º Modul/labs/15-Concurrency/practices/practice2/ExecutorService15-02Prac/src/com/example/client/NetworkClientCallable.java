/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 *
 * @author alfre
 */
public class NetworkClientCallable implements Callable<RequestResponse> {

    private final RequestResponse lookup;

        public NetworkClientCallable(RequestResponse lookup) {
        this.lookup = lookup;
    }

    @Override
    public RequestResponse call() throws IOException {
        try (Socket sock = new Socket(lookup.host, lookup.port);
                Scanner scanner = new Scanner(sock.getInputStream())) {
            lookup.response = scanner.next();
            return lookup;
        }
    }
}
