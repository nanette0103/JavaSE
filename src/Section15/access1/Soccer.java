package Section15.access1;

public class Soccer {
	
	public String team;
	public String location;
	public int since;
	public String league;
	
	public Soccer(
			String team,
			String location,
			int since,
			String leagye			
			) {
		
		this.team = team;
		this.location = location;
		this.since = since;
		this.league =league;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return team + "@" + league;
	}

}
