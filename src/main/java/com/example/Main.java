package com.example;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        String base64EncodedString = "LVmDIcmVIuNVPObjLXkVbFc13NCX1Md3DjrvfiioMQHS7QmizT3dlSujgA7NS0zI...";
        
        // Decodifica Base64
        byte[] decodedBytes = Base64.getDecoder().decode(base64EncodedString);

        // Ora puoi passare `decodedBytes` al tuo metodo di decrittografia
    }
}
