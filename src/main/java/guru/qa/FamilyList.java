package guru.qa;

import java.util.ArrayList;

public class FamilyList {

    private final ArrayList<String> familyMembers = new ArrayList<>();

    final void add(final String member) {
        familyMembers.add(member);
    }

    final String searchFamilyMember(final String member) {
        for (int i = 0; i < familyMembers.size(); i++) {
            if (familyMembers.get(i).equals(member)) {
                return member + " found";
            }
        }
        return member + " not found";
    }

    final void clearFamilyMember(final String member) {
        familyMembers.remove(member);
    }

    final void print() {
        System.out.print(familyMembers);
    }
}
