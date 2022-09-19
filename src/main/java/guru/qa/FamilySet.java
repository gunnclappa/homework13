package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class FamilySet {

    private final Set<String> familyMembers = new HashSet<>();

    final void add(final String member) {
        familyMembers.add(member);
    }

    final boolean searchFamilyMember(final String member) {
        return familyMembers.contains(member);
    }

    final void clearFamilyMember(final String member) {
        familyMembers.remove(member);
    }

    final void print() {
        System.out.print(familyMembers);
    }
}
