package com.virtusa.capitalization.manager;

import java.io.IOException;

public interface Character {



    static final  char[] capitalLater = {'A' ,'B' ,'C' ,'D' ,'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public  char[] getCapitalLeters() throws IOException;



}
