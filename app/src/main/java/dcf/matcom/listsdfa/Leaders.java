package dcf.matcom.listsdfa;

/**
 * Created by dfinlay-air on 05/06/15.
 */
public class Leaders {

    String leader;
    String country;

    public Leaders(String leader, String country) {
        this.leader = leader;
        this.country = country;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Leaders leaders = (Leaders) o;

        if (country != null ? !country.equals(leaders.country) : leaders.country != null)
            return false;
        if (leader != null ? !leader.equals(leaders.leader) : leaders.leader != null) return false;

        return true;
    }


}


