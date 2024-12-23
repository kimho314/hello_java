package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id){
        this.id = id;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof UserV2 userV2)){
            return false;
        }

        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
