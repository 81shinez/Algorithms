package com.algo.leetCode.encodeAndDecodeTinyURL;

import java.util.Date;
import java.util.HashMap;

public class Codec {
    HashMap<String, String> decodeMap = new HashMap<>();
    int counter = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        decodeMap.put(String.valueOf(counter), longUrl);
        counter++;
        return "http://tinyurl.com/"+ (counter - 1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return decodeMap.get(shortUrl.split("com/")[1]);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
//
//import java.util.Date;
//        import java.util.HashMap;
//
//public class Codec {
//    HashMap<String, String> decodeMap = new HashMap<>();
//
//    // Encodes a URL to a shortened URL.
//    public String encode(String longUrl) {
//        String str = Long.toString(new Date().getTime(), 36);
//        decodeMap.put(str, longUrl);
//        return "http://tinyurl.com/"+str;
//    }
//
//    // Decodes a shortened URL to its original URL.
//    public String decode(String shortUrl) {
//        return decodeMap.get(shortUrl.split("com/")[1]);
//    }
//}