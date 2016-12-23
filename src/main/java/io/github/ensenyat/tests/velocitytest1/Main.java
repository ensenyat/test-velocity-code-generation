package io.github.ensenyat.tests.velocitytest1;


import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

/**
 * Created by avd on 2016-12-22.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("name", "Ariel");
        Template template = velocityEngine.getTemplate("mytemplate.vm");
        StringWriter sw = new StringWriter();
        template.merge(velocityContext, sw);
        System.out.println(sw.toString());
    }
}
