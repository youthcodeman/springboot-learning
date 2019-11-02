package org.hzg.springboot;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {	
	public Health health() {
		return Health.up().withDetail("error", "spring boot error").build();
	}
}
