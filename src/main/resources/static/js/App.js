"use strict";
var Topic = React.createClass({
	 getInitialState: function() {
		    return {};
		  },
	componentDidMount: function() {
		    var component = this;
		    $.get("http://localhost:8080/topics", function(data) {
		      component.setState(data);
		    });
		    },		 
 render: function() {
    return (
      <div>
        <h3>{this.state.description}</h3>
        <h4>{this.state.id}</h4>
        </div>
    );
  }
});
ReactDOM.render(<Topic/>,document.getElementById("App"));
