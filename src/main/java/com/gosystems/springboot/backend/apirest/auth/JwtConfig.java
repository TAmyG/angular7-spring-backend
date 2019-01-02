package com.gosystems.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA="alguna.clave.secreta.123456789";
	public static final String RSA_PRIVATE ="-----BEGIN RSA PRIVATE KEY-----\n" + 
			"MIIEowIBAAKCAQEA2faik/WkoJVtpxJqIKfQQpZ7NdQl67dUO0NcyD3APb00JgDX\n" + 
			"OpoTY3WHo1yFFtpVaatw7GaFgY1Wu9a4yMtzlOmdO0Kg1+wY/dAZ4p22OffRr8JV\n" + 
			"fTpgjmDVHLoRCjqOCCvWKg9dhmFC12Ii0uxnhACvVn2AS9S0kNppMy4bc9dMkdOZ\n" + 
			"uxmpKdh7gikbjMXJZPzhiSnzpjyLEC/oIMxVycmwwWeNmZIWk+blJnaczvP8JeP6\n" + 
			"xd1JbdhS1yRg3kSZuB4KMBwsheMBUBuXhOKOYMGiJPgOcnF88A8/fwg5I0YbdK9L\n" + 
			"6eAaSScxi7sQoOsSNdTmACcgPSKeQFJY0fmelwIDAQABAoIBAGbiQ3Wh8taWEk9V\n" + 
			"ouDNNcHotDoBbPDp9YmPz4D5nP/HipERvoZ76gD9nkvfRTc3Ui/x6/i6n/Q6GiHK\n" + 
			"RikJ2AIHj99EIRYq7NUJ4N4WYcjVEJZtHdthregnDxFjRt3UK+zxfEMYQ6ZFzL5M\n" + 
			"JXH4gxhNFna2ANRKj/z8C8JL1kuECwPTxfdY/H0hftQn9HZGHLkywp0rr0n1RBi3\n" + 
			"CRQUZPfs8KNbeddx+vMhMoTWGTfVN3rpodSC7gMBfBbRlaVD2Qf4QKG4FCi8ywxu\n" + 
			"vG2D1Y1IuuABUBbWgz5lrMDQjU6TNGEiQ6vcv5Cool4sSJNCLc7cAubutfolWyfI\n" + 
			"8zUIUVkCgYEA9cTb3OtcanP9KLpZPbJqmup+EVRIwpJGrcZb4XXThULgKdPWebMP\n" + 
			"GfxJdT3oPmzthmLwZwbYXg50JbRVetJ0igPQe0mRFovifx8l5vPE95zUzke1k4zN\n" + 
			"cX9v4b4o26BPjPLkCFb29plCD60X1/hUf13oAUgKQhy8hiopXUFS+6UCgYEA4wl0\n" + 
			"Wbh8V5wx3jUmCI1df6qBXRq39bRuxI2nBqq6YEsMcdTdGBSGQq8h69MAeDxikjHd\n" + 
			"rrkL3c9LsEYjfo4Wqiy7lUoXNuftypUtQqJXw7mFRIlJmJzg3Cvndd0p5IYg3Giy\n" + 
			"lpmeW/TglKJ+p4L0IGtBDFFJIBdRYvHfG6x+TIsCgYAR18b2lQfSmrUofc740bk3\n" + 
			"ogqhC3N03NXQy/PjvIAszpwjrUOG9l8ETfKvVl1EGvhrp0c406Blw7re+eay0hCv\n" + 
			"7HL4YHDuKB27iPFhgRUtvO8eQsqF+dT4hn4C76FbwJnF6+RuTpIDeUD4jmKKxXat\n" + 
			"AI5VeXt1LUzqmKkEIjf6GQKBgB06WV03j+JjfFQD+Zp+QHwwAilvSCF8kgoBxm/o\n" + 
			"SMgewUJiSfhQpBwvmalXZ6cS9wmlG8njjrCGgFL4JJelSSutSJTmjeiGoSlEXShH\n" + 
			"6A6NcqepGO1pvNT7XffhegQudEqLu/oBWs6xzruz06RTCoSl6iDg0g4sklCvnK5e\n" + 
			"XYATAoGBAJqvfPK9zVJHPim3gD6iArbZpZb4we1GTYlh8Ty9E3iS9nZabC8VW2vP\n" + 
			"Iiz4vMRYeDaAl+SKftcmDgnm0vXWOxIvYqBWz7aY/CPGVHajQQYZSIIy3gvJ4jmN\n" + 
			"MnE/xngPbO8sG8IoUBmblrBWOvcT5Ty0FG5KRZymqNxVDljN8h25\n" + 
			"-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2faik/WkoJVtpxJqIKfQ\n" + 
			"QpZ7NdQl67dUO0NcyD3APb00JgDXOpoTY3WHo1yFFtpVaatw7GaFgY1Wu9a4yMtz\n" + 
			"lOmdO0Kg1+wY/dAZ4p22OffRr8JVfTpgjmDVHLoRCjqOCCvWKg9dhmFC12Ii0uxn\n" + 
			"hACvVn2AS9S0kNppMy4bc9dMkdOZuxmpKdh7gikbjMXJZPzhiSnzpjyLEC/oIMxV\n" + 
			"ycmwwWeNmZIWk+blJnaczvP8JeP6xd1JbdhS1yRg3kSZuB4KMBwsheMBUBuXhOKO\n" + 
			"YMGiJPgOcnF88A8/fwg5I0YbdK9L6eAaSScxi7sQoOsSNdTmACcgPSKeQFJY0fme\n" + 
			"lwIDAQAB\n" + 
			"-----END PUBLIC KEY-----";

}
