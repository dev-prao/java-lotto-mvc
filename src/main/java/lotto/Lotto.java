package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {

    private Long id;
    private final List<Integer> lotto;

    public Lotto(List<Integer> lotto) {
        validate(lotto);
        this.lotto = lotto;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public List<Integer> getLotto() {
        return Collections.unmodifiableList(lotto);
    }
}
