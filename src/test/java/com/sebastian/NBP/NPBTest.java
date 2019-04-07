package com.sebastian.NBP;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class NPBTest {

    @Test
    void fakedMain(){
        NPB repository = new NPB();
        String response = repository.getResponse();
        System.out.println(response);
    }

}