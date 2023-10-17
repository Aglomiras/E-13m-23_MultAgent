package org.mpei.ClassWork_10;

import java.util.Optional;

public class Main {
    /**
     * xml
     * Json
     * logging
     * */
    public static void main(String[] args) {
        Optional<RegulatorConfig> parse = XmlUtils.parse("src\\main\\resources\\config.xml", RegulatorConfig.class);
        System.out.println(parse);

        String code = JsonUtils.code(parse.get());
        System.out.println(code);

    }
}
