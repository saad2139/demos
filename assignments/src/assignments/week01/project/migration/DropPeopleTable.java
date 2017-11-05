package assignments.week01.project.migration;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DropPeopleTable extends AbstractMigration
{
	/**
	 * @see AbstractMigration
	 */
	public void run()
	{
		String sql = "DROP TABLE IF EXISTS people";
		PreparedStatement stmt = null;
		
		try {
			stmt = this.connection.prepareStatement( sql );			
			stmt.execute();			
			stmt.close();
		} catch(SQLException e) {
			log.error( e.getMessage() );
		} 
	}
}
