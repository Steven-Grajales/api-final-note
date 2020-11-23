package karate.performance

import com.intuit.karate.gatling.PreDef.karateFeature
import io.gatling.core.Predef.{Simulation, openInjectionProfileFactory, rampUsers, scenario}

import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

class NotaSimulation extends Simulation {

  val getAllNotas = scenario("list")
    .exec(karateFeature("classpath:karate/nota/v1/list.feature"))

  setUp(
    getAllNotas.inject(rampUsers(10) during (5 seconds))
  )
  
}
