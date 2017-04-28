'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom')
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {events: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/events'}).done(response => {
			this.setState({events: response.entity._embedded.events});
		});
	}

	render() {
		return (
			<EventsList events={this.state.events}/>
		)
	}
}
// end::app[]

// tag::employee-list[]
class EventsList extends React.Component{
	render() {
		var events = this.props.events.map(event =>
			<Event key={event._links.self.href} event={event}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Event Name</th>
						<th>Event Date</th>
					</tr>
					{events}
				</tbody>
			</table>
		)
	}
}
// end::employee-list[]

// tag::employee[]
class Event extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.event.eventName}</td>
				<td>{this.props.event.eventDate}</td>
			</tr>
		)
	}
}
// end::employee[]

// tag::render[]
ReactDOM.render(
	<App />,
	document.getElementById('react')
)
// end::render[]
