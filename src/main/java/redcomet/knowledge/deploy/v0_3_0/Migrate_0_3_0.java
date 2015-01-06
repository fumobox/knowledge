package redcomet.knowledge.deploy.v0_3_0;

import redcomet.knowledge.deploy.Migrate;
import redcomet.ormapping.tool.dao.InitializeDao;

public class Migrate_0_3_0 implements Migrate {
	
	public static Migrate_0_3_0 get() {
		return redcomet.di.Container.getComp(Migrate_0_3_0.class);
	}

	@Override
	public boolean doMigrate() throws Exception {
		InitializeDao initializeDao = InitializeDao.get();
		String[] sqlpaths = {
				"/redcomet/knowledge/deploy/v0_3_0/migrate.sql",
				"/redcomet/knowledge/deploy/v0_3_0/migrate2.sql"
		};
		initializeDao.initializeDatabase(sqlpaths);
		return true;
	}

}