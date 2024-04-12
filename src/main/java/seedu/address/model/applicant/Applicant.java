package seedu.address.model.applicant;

import java.util.Set;

import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Note;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.tag.Tag;

/**
 * Represents an Applicant.
 */
public class Applicant extends Person {

    private final Role role;
    private final Stage stage;
    private final String img;

    /**
     * Every field must be present and not null.
     */
    public Applicant(Name name, Phone phone, Email email, Address address, Role role, Stage stage, Set<Tag> tags,
                     Note note, String noteDate, String img) {
        super(name, phone, email, address, tags, note, noteDate, img);
        this.role = role;
        this.stage = stage;
        this.img = img;
    }

    /**
     *  For quick initialization of applicant with existing person
     */
    public Applicant(Person p, Role role, Stage stage, String img) {
        super(p.getName(), p.getPhone(), p.getEmail(), p.getAddress(), p.getTags(), p.getNote(),
                p.getNoteDate(), p.getImg());
        this.role = role;
        this.stage = stage;
        this.img = img;
    }

    public Role getRole() {
        return role;
    }

    public Stage getStage() {
        return stage;
    }

    public String getImg() {
        return img;
    }

    /**
     * Returns true if both applicants have the same identity and data fields.
     * This defines a stronger notion of equality between two applicants.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Applicant)) {
            return false;
        }

        Applicant otherApplicant = (Applicant) other;
        return super.equals(otherApplicant)
            && role.equals(otherApplicant.role)
            && stage.equals(otherApplicant.stage);
    }
}
