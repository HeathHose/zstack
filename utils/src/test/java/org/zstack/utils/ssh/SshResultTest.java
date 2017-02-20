package org.zstack.utils.ssh;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * Created by heathhose on 17-2-18.
 */
public class SshResultTest {
    @Test
    public void toSimpleString() throws Exception {
        StringBuilder sb = new StringBuilder("\nssh command failed");
        sb.append(String.format("\nreturn code: %s", 250));
        sb.append(String.format("\ncommand: %s", "lllllllll"));
        sb.append(String.format("\nreturn Code: %s", "ssh connection is failed"));
        sb.append(String.format("\nexitErrorMessage: %s", null));
        String str = sb.toString();
//        Pattern.compile()
        String tureStr = str.replaceAll("^command:*$return","");
        System.out.println(tureStr);
//        (?<=command)\s+(?=return\b

    }

}