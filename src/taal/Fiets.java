package taal;

/**
 *
 */
public class Fiets {

    private String merk;
    private String type;

    /**
     *
     * @param merk het
     * @param type
     */
    public Fiets(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    /**
     *
     * @return het merk
     */
    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fiets fiets = (Fiets) o;

        if (merk != null ? !merk.equals(fiets.merk) : fiets.merk != null) return false;
        return type != null ? type.equals(fiets.type) : fiets.type == null;
    }

    @Override
    public int hashCode() {
        int result = merk != null ? merk.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
