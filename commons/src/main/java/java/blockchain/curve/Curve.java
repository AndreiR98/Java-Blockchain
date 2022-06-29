package java.blockchain.curve;


import lombok.*;

import java.blockchain.math.Point;
import java.math.BigInteger;


@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Curve {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger n;
    private Point g;
    private String oid;
    private String name;
}
