package tn.teamwill.demo.domain;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpeakerRepositoryTest {
	@Autowired
	private SpeakerRepository speakerRepository;

	@Test
	public void findByTwitter() {
		Speaker speaker = speakerRepository.save(new Speaker("daly", "bettaieb", "medbett"));
		assertThat(speakerRepository.findByTwitter("medbett").getId(), Is.is(speaker.getId()));
	}

	@Test
	@Ignore
	public void findByLastName() {
		Speaker speaker = speakerRepository.save(new Speaker("daly", "bettaieb", "medbett"));
		assertThat(speakerRepository.findByLastName("").size(), Is.is(speaker.getId()));
	}
}