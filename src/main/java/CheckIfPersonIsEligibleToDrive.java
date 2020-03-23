public class CheckIfPersonIsEligibleToDrive implements CheckPerson{
    public boolean test(Person p) {
        return p.getAge() > 16;
    }
}
