module space.arim.libertybans.core {
	requires com.github.benmanes.caffeine;
	requires com.zaxxer.hikari;
	requires jakarta.inject;
	requires net.kyori.adventure;
	requires net.kyori.examination.api;
	requires org.flywaydb.core;
	requires org.slf4j;
	requires space.arim.api.env;
	requires space.arim.api.jsonchat;
	requires space.arim.api.util.dazzleconf;
	requires space.arim.api.util.web;
	requires space.arim.dazzleconf;
	requires space.arim.dazzleconf.ext.snakeyaml;
	requires space.arim.jdbcaesar;
	requires transitive space.arim.libertybans.api;
	requires transitive space.arim.libertybans.bootstrap;
	exports space.arim.libertybans.core;
	exports space.arim.libertybans.core.alts to space.arim.dazzleconf, space.arim.injector;
	exports space.arim.libertybans.core.commands;
	exports space.arim.libertybans.core.commands.extra to space.arim.injector;
	exports space.arim.libertybans.core.commands.usage to space.arim.injector;
	exports space.arim.libertybans.core.config;
	exports space.arim.libertybans.core.database to space.arim.injector;
	exports space.arim.libertybans.core.env;
	//exports space.arim.libertybans.core.event;
	exports space.arim.libertybans.core.importing;
	exports space.arim.libertybans.core.punish;
	exports space.arim.libertybans.core.scope;
	exports space.arim.libertybans.core.selector;
	exports space.arim.libertybans.core.service;
	exports space.arim.libertybans.core.uuid
			to space.arim.dazzleconf, space.arim.injector;

	opens space.arim.libertybans.core.alts to space.arim.dazzleconf;
	opens space.arim.libertybans.core.config to space.arim.dazzleconf;
	opens space.arim.libertybans.core.selector to space.arim.dazzleconf;
	opens space.arim.libertybans.core.uuid to space.arim.dazzleconf;
}