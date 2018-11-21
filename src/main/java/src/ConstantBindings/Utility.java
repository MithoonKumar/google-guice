package src.ConstantBindings;


import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Utility {
    private String jdbcUrl;

    @Inject
    public Utility(@Named("JDBC") String url) {
        this.jdbcUrl = url;
    }

    public String method () {
        return this.jdbcUrl;
    }
}
