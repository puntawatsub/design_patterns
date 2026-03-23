import java.util.Date;
import java.util.Objects;

public class RealDocument extends Document {
    private int id;
    private Date date;
    private String content;

    public RealDocument(int id, String content) {
        this.id = id;
        this.date = new Date();
        this.content = content;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getCreationDate() {
        return date.toString();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RealDocument that = (RealDocument) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
