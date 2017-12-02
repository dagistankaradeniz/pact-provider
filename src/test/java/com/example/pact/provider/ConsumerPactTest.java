package com.example.pact.provider;

import au.com.dius.pact.provider.junit.IgnoreNoPactsToVerify;
import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;

@RunWith(PactRunner.class)
@Provider("pact-provider")
@IgnoreNoPactsToVerify
@PactBroker(host="${pactbroker.hostname:localhost}", port = "8080")
public class ConsumerPactTest {

	@TestTarget
	public final Target target = new HttpTarget(8888);

	@BeforeClass
	public static void startSpring(){
		SpringApplication.run(ProviderDemoApplication.class);
	}

	@State({"default", "extra"})
	public void toDefaultState() {
		System.out.println("Now service in default state");
	}
}
