package de.spiller.maven.services.impl;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CustomerServiceImplTest {

    @Test
    public void testList() throws Exception {
        assertThat(new CustomerServiceImpl().list(), is(not(nullValue())));
    }

}
