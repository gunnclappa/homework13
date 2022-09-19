package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class FamilyMap {

    private final Map<Integer, String> familyMembers = new HashMap<>();

    final void add(final int passportNumber, final String member) {
        familyMembers.put(passportNumber, member);
    }

    final String searchFamilyMember(final int passportNumber) {
        for (Map.Entry<Integer, String> entry : familyMembers.entrySet()) {
            if (entry.getKey().equals(passportNumber)) {
                return entry.getValue() + " found";
            }
        }
        return "Member not found";
    }

    final void clearFamilyMember(final int passportNumber) {
        familyMembers.remove(passportNumber);
    }

    final void print() {
        System.out.print(familyMembers);
    }
}
