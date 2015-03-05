/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EnvironmentTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.EnvironmentRecord> {

	private static final long serialVersionUID = 1891379487;

	/**
	 * The singleton instance of <code>cattle.environment</code>
	 */
	public static final io.cattle.platform.core.model.tables.EnvironmentTable ENVIRONMENT = new io.cattle.platform.core.model.tables.EnvironmentTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.EnvironmentRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.EnvironmentRecord.class;
	}

	/**
	 * The column <code>cattle.environment.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.environment.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.environment.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.environment.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.environment.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.environment.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.environment.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.environment.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.environment.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.environment.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.environment.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * Create a <code>cattle.environment</code> table reference
	 */
	public EnvironmentTable() {
		this("environment", null);
	}

	/**
	 * Create an aliased <code>cattle.environment</code> table reference
	 */
	public EnvironmentTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.EnvironmentTable.ENVIRONMENT);
	}

	private EnvironmentTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.EnvironmentRecord> aliased) {
		this(alias, aliased, null);
	}

	private EnvironmentTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.EnvironmentRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.EnvironmentRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_ENVIRONMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.EnvironmentRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_ENVIRONMENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.EnvironmentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.EnvironmentRecord>>asList(io.cattle.platform.core.model.Keys.KEY_ENVIRONMENT_PRIMARY, io.cattle.platform.core.model.Keys.KEY_ENVIRONMENT_IDX_ENVIRONMENT_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.EnvironmentRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.EnvironmentRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_ENVIRONMENT__ACCOUNT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.EnvironmentTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.EnvironmentTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.EnvironmentTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.EnvironmentTable(name, null);
	}
}
