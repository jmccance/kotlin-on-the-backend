package demo.domain;

import java.time.Instant;

public class Widget {

  private final Long id;
  private final WidgetColor color;
  private final Instant createdAt;

  public Widget(final Long id, final WidgetColor color, final Instant createdAt) {
    this.id = id;
    this.color = color;
    this.createdAt = createdAt;
  }

  public WidgetColor getColor() {
    return color;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Long getId() {
    return id;
  }
}

