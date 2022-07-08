package nextstep.subway.auth.dto;

import nextstep.subway.common.MaskingUtil;

public class TokenRequest {
    private String email;
    private String password;

    public TokenRequest() {
    }

    public TokenRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "TokenRequest{" +
            "email='" + MaskingUtil.maskWord(email,3) + '\'' +
            ", password='" + MaskingUtil.maskWord(email,0) + '\'' +
            '}';
    }
}
