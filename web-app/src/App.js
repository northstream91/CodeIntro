import React, { Component } from 'react';
import Home from './Home';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

class App extends Component {
  render() {
    console.log("This is app");
    return (
      <Router>
        <Switch>
          <Route path='/' exact={true}>
            <Home />
          </Route>
        </Switch>
      </Router>
    );
  }
}

export default App;