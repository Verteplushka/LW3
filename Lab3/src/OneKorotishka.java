import java.util.Objects;

public class OneKorotishka extends Korotishka implements AbleToHaveIdea{
    private Type type;
    private String idea = "noIdea";

    public OneKorotishka(String name, Place place, Type type){
        super(name, place);
        this.setType(type);
    }

    @Override
    public void goTo(Place place){
        System.out.println(this.getName() + " уехал в " + place);
        this.setPlace(place);
    }

    @Override
    public void read(Note note){
        System.out.println(this.getName() + " прочитал записку \"" + note.getMessage() + "\" от " + note.getWriter());
    }

    @Override
    public void understandLocation(Korotishka korotishka, Place place){
        System.out.println(this.getName() + " понял, что " + korotishka.getName() + " сейчас в " + place);
    }

    @Override
    public void setNewIdea(String idea){
        if(this.type == Type.UNPREDICTABLE){
            System.out.println(this.getName() + " решил " + idea);
        }
        else{
            System.out.println(this.getName() + " подумал, что было бы неплохо " + idea);
        }
    }

    public String getIdea() {
        return idea;
    }

    public Type getType() {
        return type;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Коротышка";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()){ return false;}
        OneKorotishka oneKorotishka = (OneKorotishka) obj;
        return this.getName().equals(oneKorotishka.getName()) && this.getPlace().equals(oneKorotishka.getPlace()) && this.getType().equals(oneKorotishka.getType()) && this.getIdea().equals(oneKorotishka.getIdea());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getPlace(), this.getType(), this.getIdea());
    }
}
