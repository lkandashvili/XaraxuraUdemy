package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager extends Employee {
    private int orgSize = 0;
    private int directReports = 0;
    private final String mngrRegex = "\\w+=(?<orgsize>\\w+),\\w+=(?<dr>\\w+)";
    private final Pattern mngrPat = Pattern.compile(mngrRegex);

    public Manager(String personText) {
        super(personText);

            Matcher mngrPat = this.mngrPat.matcher(peopleMat.group("details"));
            if (mngrPat.find()) {
                this.orgSize = Integer.parseInt(mngrPat.group("orgsize"));
                this.directReports = Integer.parseInt(mngrPat.group("dr"));
            }
    }
    public int getSalary() {
        return 3500 + orgSize * directReports;
    }
}
