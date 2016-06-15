package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * FlexibleProjectStates generated by hbm2java
 */
public class FlexibleProjectStates implements java.io.Serializable {

	private String state;
	private Serializable stateOrder;
	private Set<FlexibleProjects> flexibleProjectses = new HashSet<FlexibleProjects>(0);
	private Set<FlexibleProjectTransitions> flexibleProjectTransitionses = new HashSet<FlexibleProjectTransitions>(0);

	public FlexibleProjectStates() {
	}

	public FlexibleProjectStates(String state, Serializable stateOrder) {
		this.state = state;
		this.stateOrder = stateOrder;
	}

	public FlexibleProjectStates(String state, Serializable stateOrder, Set<FlexibleProjects> flexibleProjectses,
			Set<FlexibleProjectTransitions> flexibleProjectTransitionses) {
		this.state = state;
		this.stateOrder = stateOrder;
		this.flexibleProjectses = flexibleProjectses;
		this.flexibleProjectTransitionses = flexibleProjectTransitionses;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Serializable getStateOrder() {
		return this.stateOrder;
	}

	public void setStateOrder(Serializable stateOrder) {
		this.stateOrder = stateOrder;
	}

	public Set<FlexibleProjects> getFlexibleProjectses() {
		return this.flexibleProjectses;
	}

	public void setFlexibleProjectses(Set<FlexibleProjects> flexibleProjectses) {
		this.flexibleProjectses = flexibleProjectses;
	}

	public Set<FlexibleProjectTransitions> getFlexibleProjectTransitionses() {
		return this.flexibleProjectTransitionses;
	}

	public void setFlexibleProjectTransitionses(Set<FlexibleProjectTransitions> flexibleProjectTransitionses) {
		this.flexibleProjectTransitionses = flexibleProjectTransitionses;
	}

}
