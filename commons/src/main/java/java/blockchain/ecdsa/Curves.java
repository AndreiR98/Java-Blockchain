package java.blockchain.ecdsa;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.blockchain.curve.Curve;
import java.math.BigInteger;

@Configuration
public class Curves {
    @Bean
    public Curve NIST256p(){
        return new Curve();
    }

    @Bean
    public Curve SECP256k1(){
        return new Curve();
    }
}
