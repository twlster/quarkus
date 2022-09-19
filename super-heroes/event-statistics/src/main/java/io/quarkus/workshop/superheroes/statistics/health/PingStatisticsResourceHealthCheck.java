package io.quarkus.workshop.superheroes.statistics.health;

import io.quarkus.workshop.superheroes.statistics.StatisticResource;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import javax.inject.Inject;

@Liveness
public class PingStatisticsResourceHealthCheck implements HealthCheck {

    @Inject
    StatisticResource statisticResource;

    @Override
    public HealthCheckResponse call() {
        String response = statisticResource.hello();
        return HealthCheckResponse.named("Ping Statistics REST Endpoint").withData("Response", response).up().build();
    }
}