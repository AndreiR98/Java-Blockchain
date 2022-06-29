package java.blockchain.math;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class Point {
    private BigInteger x;
    private BigInteger y;
    private BigInteger z;
}
