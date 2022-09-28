package guru.springframework.SfgPetClinicData.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by jt on 7/29/18.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

	private static final long serialVersionUID = 1L;
    public Visit(Long id)
	{
		super(id);
	}

	@Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

	public Pet getPet()
	{
		return pet;
	}

}
