package demo.ex001_beans;

import java.time.LocalDate;
import java.util.Objects;

public class JavaPet {

  private final long id;
  private final String name;
  private final LocalDate lastVisit;

  public JavaPet(final long id, final String name, final LocalDate lastVisit) {
    Objects.requireNonNull(name);
    this.id = id;
    this.name = name;
    this.lastVisit = lastVisit;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LocalDate getLastVisit() {
    return lastVisit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JavaPet javaPet = (JavaPet) o;
    return id == javaPet.id &&
        Objects.equals(name, javaPet.name) &&
        Objects.equals(lastVisit, javaPet.lastVisit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastVisit);
  }


}
